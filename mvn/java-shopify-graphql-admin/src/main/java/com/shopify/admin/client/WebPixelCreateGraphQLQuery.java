package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.WebPixelInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Activate a [web pixel extension](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels)
 * by creating a web pixel record on the store where you installed your app.
 *   
 * When you run the `webPixelCreate` mutation, Shopify validates it
 * against the settings definition in `shopify.extension.toml`. If the `settings` input field doesn't match
 * the schema that you defined, then the mutation fails. Learn how to
 * define [web pixel settings](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels#step-2-define-your-web-pixel-settings).
 */
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

    /**
     * The web pixel settings in JSON format.
     */
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
