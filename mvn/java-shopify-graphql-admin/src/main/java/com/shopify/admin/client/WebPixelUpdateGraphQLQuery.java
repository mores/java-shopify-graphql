package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.WebPixelInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Activate a [web pixel extension](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels)
 * by updating a web pixel record on the store where you installed your app.
 *   
 * When you run the `webPixelUpdate` mutation, Shopify validates it
 * against the settings definition in `shopify.extension.toml`. If the `settings` input field doesn't match
 * the schema that you defined, then the mutation fails. Learn how to
 * define [web pixel settings](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels#step-2-define-your-web-pixel-settings).
 */
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

    /**
     * The ID of the web pixel to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
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
