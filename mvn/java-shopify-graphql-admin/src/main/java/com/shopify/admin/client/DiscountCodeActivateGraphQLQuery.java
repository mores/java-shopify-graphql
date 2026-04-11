package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Activates a previously created code discount, making it available for
 * customers to use during checkout. This mutation transitions inactive discount
 * codes into an active state where they can be applied to orders.
 *   
 * For example, after creating a "SUMMER20" discount code but leaving it inactive
 * during setup, merchants can activate it when ready to launch their summer
 * promotion campaign.
 *   
 * Use `DiscountCodeActivate` to:
 * - Launch scheduled promotional campaigns
 * - Reactivate previously paused discount codes
 * - Enable discount codes after configuration changes
 * - Control the timing of discount availability
 *   
 * The mutation returns the updated discount code node with its new active status
 * and handles any validation errors that might prevent activation, such as
 * conflicting discount rules or invalid date ranges.
 */
public class DiscountCodeActivateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeActivateGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public DiscountCodeActivateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeActivate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public DiscountCodeActivateGraphQLQuery build() {
      return new DiscountCodeActivateGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the code discount to activate.
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
