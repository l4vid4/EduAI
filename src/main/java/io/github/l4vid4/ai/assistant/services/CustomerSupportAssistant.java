/*
 * Copyright 2024-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ai.spring.demo.ai.playground.services;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.vectorstore.QuestionAnswerAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Map;

/**
 * * @author Christian Tzolov
 */
@Service
public class CustomerSupportAssistant {

	private final ChatClient chatClient;

	// @formatter:off
//	public CustomerSupportAssistant(
//		ChatClient.Builder chatClientBuilder,
//		BookingTools bookingTools,
//		VectorStore vectorStore,
//		ChatMemory chatMemory
//	) {
//		this.chatClient = chatClientBuilder
//				.defaultSystem("""
//						You are a customer chat support agent of an airline named "Funnair"."
//						Respond in a friendly, helpful, and joyful manner.
//						You are interacting with customers through an online chat system.
//						Before answering a question about a booking or cancelling a booking, you MUST always
//						get the following information from the user: booking number, customer first name and last name.
//						If you can not retrieve the status of my flight, please just say "I am sorry, I can not find the booking details".
//						Check the message history for booking details before asking the user.
//						Before changing a booking you MUST ensure it is permitted by the terms.
//						If there is a charge for the change, you MUST ask the user to consent before proceeding.
//						Use the provided functions to fetch booking details, change bookings, and cancel bookings.
//					""")
//				.defaultAdvisors(
//					MessageChatMemoryAdvisor.builder(chatMemory).build(),
//					QuestionAnswerAdvisor.builder(vectorStore).build()
//				)
//				.defaultTools(bookingTools)
//				.build();
//	}

	// @formatter:off
	public CustomerSupportAssistant(
			ChatClient.Builder chatClientBuilder,
			StudentTools studentTools,
			VectorStore vectorStore,
			ChatMemory chatMemory
	) {
		this.chatClient = chatClientBuilder
				.defaultSystem("""
						现在你是河北工业大学电气工程学院的辅导员助理，以友好、乐于助人和愉快的方式回应。
						你作为学生信息专家正在通过在线聊天与老师互动。
						从用户那里获取要查询的学生学号或学生姓名，
						你可以使用提供的功能查询学生信息（包括学生基本信息或成绩信息），
						如果没有查询到信息，请说”对不起，系统上没有该学生信息，请检查学号是否有误“。
						你需要具备基本的聊天功能，而不是仅仅作为信息查询。
					""")
				.defaultAdvisors(
						MessageChatMemoryAdvisor.builder(chatMemory).build(),
						QuestionAnswerAdvisor.builder(vectorStore).build()
				)
				.defaultTools(studentTools)
				.build();
	}

	public Flux<String> chat(String chatId, String userMessage, Object... additionalTools) {

		return this.chatClient.prompt()
			.user(userMessage)
			.tools(additionalTools)
			.advisors(a -> a.param(ChatMemory.CONVERSATION_ID, chatId))
			.stream()
			.content();	
	}
	// @formatter:on

}