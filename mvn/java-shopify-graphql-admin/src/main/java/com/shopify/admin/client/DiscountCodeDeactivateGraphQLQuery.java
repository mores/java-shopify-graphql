package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Temporarily suspends a code discount without permanently removing it from the
 * store. Deactivation allows merchants to pause promotional campaigns while
 * preserving the discount configuration for potential future use.
 *   
 * For example, when a flash sale needs to end immediately or a discount code
 * requires temporary suspension due to inventory issues, merchants can
 * deactivate it to stop new redemptions while keeping the discount structure intact.
 *   
 * Use `DiscountCodeDeactivate` to:
 * - Pause active promotional campaigns timely
 * - Temporarily suspend problematic discount codes
 * - Control discount availability during inventory shortages
 * - Maintain discount history while stopping usage
 *   
 * Deactivated discounts remain in the system and can be reactivated later,
 * unlike deletion which persistently removes the code. Customers attempting to
 * use deactivated codes will receive appropriate error messages.
 */
public class DiscountCodeDeactivateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeDeactivateGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public DiscountCodeDeactivateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeDeactivate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public DiscountCodeDeactivateGraphQLQuery build() {
      return new DiscountCodeDeactivateGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the code discount to deactivate.
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
