package org.ff.requesthandler.service;

import org.apache.log4j.Logger;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.Json;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;

public class RequestHandlerServiceVerticle extends AbstractVerticle {
	
	
	final static Logger logger = Logger.getLogger(RequestHandlerServiceVerticle.class);
	
	@Override
	  public void start(Future<Void> fut) {
		
		logger.debug("In the Start method");
		
		// Create a router object.
	    Router router = Router.router(vertx);

	    // Bind "/" to our hello message - so we are still compatible.
	    router.route("/").handler(routingContext -> {
	      HttpServerResponse response = routingContext.response();
	      response
	          .putHeader("content-type", "text/html")
	          .end("<h1>Hello from my FellowFiller application - RequestHandler Service</h1>");
	    });
	    
	    router.route("/api/generateRequest*").handler(BodyHandler.create());
	//    router.get("/api/scandata").handler(this::get);
	    router.route(HttpMethod.POST, "/api/generateRequest").handler(new GenerateRequest());
	   
	   
	//    router.post("/api/generateRequest").handler(this::GenerateRequest);
	    vertx
      .createHttpServer()
      .requestHandler(router::accept)
      .listen(config().getInteger("http.port", 8085), result -> {
        if (result.succeeded()) {
          fut.complete();
        } else {
          fut.fail(result.cause());
        }
      });
	    
	}
	
	
	 private void GenerateRequest(RoutingContext routingContext) {
	
		 logger.debug("In the POST call of RequestHandlerService " );
		 
		 System.out.println(routingContext.getBodyAsString());
		 
			
			logger.debug("JSON Object: " + routingContext.getBodyAsString());
		 
	 }
	 private class GenerateRequest implements Handler<RoutingContext> {

			@Override
			public void handle(RoutingContext routingContext) {
				 logger.debug("In the POST call of RequestHandlerService " );
				 logger.debug("JSON Object: " + routingContext.getBodyAsString()); 
				 
				 final Request request = Json.decodeValue(routingContext.getBodyAsString(),
					      Request.class);
				 logger.debug("Request Object: " + request.toString());
			}
			 
		 }
}
