import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

@WebServlet(name="WelcomeServlet", urlPatterns={"/welcome"})
public class WelcomeServlet extends HttpServlet {

	private static final String NAME_PARAM = "name";

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter(NAME_PARAM);
		if (StringUtils.isBlank(name)) {
			name = "guest";
		}
		response.getWriter().println("Hi, " + name);
	}

}
