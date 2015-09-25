package com.mycompany.myapp.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.setup.*;
import org.springframework.web.context.*;

import com.mycompany.myapp.*;


public class BoardMvcTest extends ApplicationContextLoader {
	private static final Logger logger = 
			LoggerFactory.getLogger(BoardMvcTest.class);

	@Autowired
	private WebApplicationContext context;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		logger.info("setup");
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void testList() throws Exception {
		logger.info("test1");
		mockMvc.perform(get("/board/list"))
			.andExpect(model().attributeExists("list"))
			.andExpect(view().name("board/list"))
			.andExpect(status().isOk());
	}
	
	@Test
	public void testWrite() throws Exception {
		logger.info("test2");
		mockMvc.perform(
			post("/board/write")
				.param("title", "테스트1")
				.param("content", "내용1")
				.param("writer", "글쓴이1")
		)
		.andExpect(redirectedUrl("/board/list"));
	}
	
}
