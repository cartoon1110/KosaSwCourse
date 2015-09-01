package mysns.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// 모든 jsp 요청에 대해 실행
@WebFilter("*.jsp")
public class EncFilter implements Filter {
	private String encoding;
	Logger logger = LoggerFactory.getLogger(EncFilter.class);

	public EncFilter() {
	}

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 캐릭터 인코딩 설정이 없는 경우에만 수행
		if (request.getCharacterEncoding() == null) {
			request.setCharacterEncoding(encoding);
			chain.doFilter(request, response);
		}
	}

	// 초기화 파라미터 에서 인코딩 정보 가져와서 설정
	public void init(FilterConfig fConfig) throws ServletException {
		this.encoding = fConfig.getServletContext().getInitParameter("encoding");
		logger.info("Character Encoding : " + encoding);
	}

}
