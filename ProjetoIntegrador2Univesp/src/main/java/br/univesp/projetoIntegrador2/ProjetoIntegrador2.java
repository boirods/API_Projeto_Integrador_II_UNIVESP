package br.univesp.projetoIntegrador2;
import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;

public class ProjetoIntegrador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javalin app = Javalin.create().start(8081);
		app.get("/", new Handler() {
			public void handle(Context ctx) throws Exception {
				ctx.result("Api esta sendo executada...");
			}
		});
	}

}
