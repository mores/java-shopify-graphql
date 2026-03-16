package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * <div class="note">&lt;h4>Theme app extensions&lt;/h4>
 *   <p>If your app integrates with a Shopify theme and you plan to submit it to
 * the Shopify App Store, you must use theme app extensions instead of Script
 * tags. Script tags can only be used with vintage themes. <a
 * href="/apps/online-store#what-integration-method-should-i-use"
 * target="_blank">Learn more</a>.</p></div>
 *   
 * <div class="note">&lt;h4>Script tag deprecation&lt;/h4>
 *   <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade
 * to Checkout Extensibility</a> before this date. <a
 * href="/docs/api/liquid/objects#script">Shopify Scripts</a> will continue to
 * work alongside Checkout Extensibility until August 28, 2025.</p></div>
 *   
 *   
 * Returns a `ScriptTag` resource by ID.
 */
public class ScriptTagGraphQLQuery extends GraphQLQuery {
  public ScriptTagGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ScriptTagGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "scriptTag";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public ScriptTagGraphQLQuery build() {
      return new ScriptTagGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `ScriptTag` to return.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
