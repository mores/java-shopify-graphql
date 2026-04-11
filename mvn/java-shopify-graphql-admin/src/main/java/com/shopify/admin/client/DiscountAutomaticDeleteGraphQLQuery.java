package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes an existing automatic discount from the store, permanently removing it
 * from all future order calculations. This mutation provides a clean way to
 * remove promotional campaigns that are no longer needed.
 *   
 * For example, when a seasonal promotion ends or a flash sale concludes,
 * merchants can use this mutation to ensure the discount no longer applies to
 * new orders while preserving historical order data.
 *   
 * Use `DiscountAutomaticDelete` to:
 * - Remove expired promotional campaigns
 * - Clean up test discounts during development
 * - Delete automatic discounts that conflict with new promotions
 * - Maintain a clean discount configuration
 *   
 * The mutation returns the ID of the deleted discount for confirmation and any
 * validation errors if the deletion cannot be completed. Once deleted, the
 * automatic discount will no longer appear in discount lists or apply to new
 * customer orders.
 */
public class DiscountAutomaticDeleteGraphQLQuery extends GraphQLQuery {
  public DiscountAutomaticDeleteGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public DiscountAutomaticDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountAutomaticDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public DiscountAutomaticDeleteGraphQLQuery build() {
      return new DiscountAutomaticDeleteGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the automatic discount to delete.
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
