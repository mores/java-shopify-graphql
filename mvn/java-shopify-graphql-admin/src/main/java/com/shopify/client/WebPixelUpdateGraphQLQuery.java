package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.WebPixelInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class WebPixelUpdateGraphQLQuery extends GraphQLQuery {
  public WebPixelUpdateGraphQLQuery(String id, WebPixelInput webPixel, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (webPixel != null || fieldsSet.contains("webPixel")) {
        getInput().put("webPixel", webPixel);
    }
  }

  public WebPixelUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "webPixelUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private WebPixelInput webPixel;

    private String queryName;

    public WebPixelUpdateGraphQLQuery build() {
      return new WebPixelUpdateGraphQLQuery(id, webPixel, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
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
