package app;
import java.util.HashMap;
import java.util.Map;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class PageDashboard_s2b implements Handler  {
    private static final String TEMPLATE = ("dashboard_s2b.html");

    @Override
    public void handle(Context context) throws Exception {
        Map<String, Object> model = new HashMap<String, Object>();
        JDBCConnection jdbc = new JDBCConnection();

        
        
        context.render(TEMPLATE, model);
    }
}
