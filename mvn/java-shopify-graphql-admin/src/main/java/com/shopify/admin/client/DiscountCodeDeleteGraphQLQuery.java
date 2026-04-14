package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Removes a code discount from the store, making it permanently unavailable for
 * customer use. This mutation provides a clean way to eliminate discount codes
 * that are no longer needed or have been replaced.
 *   
 * For example, when a seasonal promotion ends or a discount code has been
 * compromised, merchants can delete it entirely rather than just deactivating
 * it, ensuring customers cannot attempt to use expired promotional codes.
 *   
 * Use `DiscountCodeDelete` to:
 * - persistently remove outdated promotional codes
 * - Clean up discount code lists after campaigns end
 * - Eliminate compromised or leaked discount codes
 * - Maintain organized discount management
 *   
 * Once deleted, the discount code cannot be recovered and any customer attempts
 * to use it will fail. This differs from deactivation, which preserves the code
 * for potential future reactivation.
 */
public class DiscountCodeDeleteGraphQLQuery extends GraphQLQuery {
  public DiscountCodeDeleteGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public DiscountCodeDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public DiscountCodeDeleteGraphQLQuery build() {
      return new DiscountCodeDeleteGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the code discount to delete.
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
