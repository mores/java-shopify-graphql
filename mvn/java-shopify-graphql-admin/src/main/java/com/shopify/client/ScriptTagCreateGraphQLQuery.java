package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ScriptTagInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * <div class="note"><h4>Theme app extensions</h4>
 *   <p>Your app might not pass App Store review if it uses script tags instead of
 * theme app extensions. All new apps, and apps that integrate with Online Store
 * 2.0 themes, should use theme app extensions, such as app blocks or app embed
 * blocks. Script tags are an alternative you can use with only vintage themes.
 * <a href="/apps/online-store#what-integration-method-should-i-use"
 * target="_blank">Learn more</a>.</p></div>
 *   
 * <div class="note"><h4>Script tag deprecation</h4>
 *   <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade
 * to Checkout Extensibility</a> before this date. <a
 * href="/docs/api/liquid/objects#script">Shopify Scripts</a> will continue to
 * work alongside Checkout Extensibility until August 28, 2025.</p></div>
 *   
 *   
 * Creates a new script tag.
 */
public class ScriptTagCreateGraphQLQuery extends GraphQLQuery {
  public ScriptTagCreateGraphQLQuery(ScriptTagInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ScriptTagCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "scriptTagCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ScriptTagInput input;

    private String queryName;

    public ScriptTagCreateGraphQLQuery build() {
      return new ScriptTagCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields for a script tag.
     */
    public Builder input(ScriptTagInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
