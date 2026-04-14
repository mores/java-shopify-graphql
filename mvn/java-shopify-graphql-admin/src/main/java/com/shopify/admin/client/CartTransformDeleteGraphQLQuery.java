package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Removes an existing cart transform function from the merchant's store,
 * disabling any customized bundle or cart modification logic it provided. This
 * mutation persistently deletes the transform configuration and stops all
 * associated cart processing.
 *   
 * For example, when discontinuing a bundle app or removing specific
 * merchandising features, you would delete the corresponding cart transform to
 * ensure customers no longer see the bundled products or modified cart behavior.
 *   
 * Use `CartTransformDelete` to:
 * - Deactivate customized bundle logic when removing app features
 * - Clean up unused transform functions
 * - Disable cart modifications during app uninstallation
 * - Remove outdated merchandising strategies
 * - Restore default cart behavior for merchants
 *   
 * The deletion processes immediately and returns the ID of the removed cart
 * transform for confirmation. Once deleted, the transform function stops
 * processing new cart operations, though existing cart sessions may retain their
 * current state until refresh. This ensures a clean transition without
 * disrupting active customer sessions.
 *   
 * Consider the timing of deletions carefully, as removing transforms during peak
 * shopping periods could affect customer experience if they have active carts
 * with transformed items.
 *   
 * Learn more about [managing cart transforms](https://shopify.dev/docs/apps/selling-strategies/bundles).
 */
public class CartTransformDeleteGraphQLQuery extends GraphQLQuery {
  public CartTransformDeleteGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public CartTransformDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartTransformDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public CartTransformDeleteGraphQLQuery build() {
      return new CartTransformDeleteGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * A globally-unique identifier for the cart transform.
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
