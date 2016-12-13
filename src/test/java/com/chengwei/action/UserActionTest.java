package com.chengwei.action;

import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by chengwei on 2016/12/12 19:54.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath*:/com/chengwei/test/spring-mvc-test.xml"
		, "classpath*:/com/chengwei/test/spring-mybatis-test.xml"})
@WebAppConfiguration
public class UserActionTest extends TestCase {

}