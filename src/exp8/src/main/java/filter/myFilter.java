package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Ash
 * @date 2018/12/6 14:08
 */

public class myFilter implements Filter {

    private FilterConfig filterConfig;

    public myFilter() {
        super();
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain) {
        try {
            HttpServletRequest request = (HttpServletRequest) req;
            HttpServletResponse response = (HttpServletResponse) res;
            HttpSession session = request.getSession();
            //code when login
            req.setCharacterEncoding("GBK");
            res.setCharacterEncoding("GBK");
            filterChain.doFilter(req, res);
            //code when logout
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
        //put destroy string in log
        //put your code
    }
}