package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.WebPixelInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class WebPixelCreateGraphQLQuery extends GraphQLQuery {
  public WebPixelCreateGraphQLQuery(WebPixelInput webPixel, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (webPixel != null || fieldsSet.contains("webPixel")) {
        getInput().put("webPixel", webPixel);
    }
  }

  public WebPixelCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "webPixelCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private WebPixelInput webPixel;

    private String queryName;

    public WebPixelCreateGraphQLQuery build() {
      return new WebPixelCreateGraphQLQuery(webPixel, queryName, fieldsSet);
               
    }

    
    public Builder webPixel(WebPixelInput webPixel) {
      this.webPixel = webPixel;
      this.fieldsSet.add("webPixel");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
