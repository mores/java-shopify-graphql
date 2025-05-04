package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Deactivates multiple [code-based discounts](https://help.shopify.com/manual/discounts/discount-types#discount-codes)
 * asynchronously using one of the following:
 * - A search query
 * - A saved search ID
 * - A list of discount code IDs
 *   
 * For example, you can deactivate discounts for all codes that match a search
 * criteria, or deactivate a predefined set of discount codes.
 */
public class DiscountCodeBulkDeactivateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeBulkDeactivateGraphQLQuery(String search, String savedSearchId,
      List<String> ids, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }
  }

  public DiscountCodeBulkDeactivateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeBulkDeactivate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String search;

    private String savedSearchId;

    private List<String> ids;

    private String queryName;

    public DiscountCodeBulkDeactivateGraphQLQuery build() {
      return new DiscountCodeBulkDeactivateGraphQLQuery(search, savedSearchId, ids, queryName, fieldsSet);
               
    }

    /**
     * The search query for filtering discounts.
     * <br><br>
     * For more information on the list of supported fields and search syntax, refer to the [`codeDiscountNodes`](https://shopify.dev/docs/api/admin-graphql/latest/queries/codeDiscountNodes#query-arguments) query.
     */
    public Builder search(String search) {
      this.search = search;
      this.fieldsSet.add("search");
      return this;
    }

    /**
     * The ID of the saved search for filtering discounts to deactivate. Saved
     * searches represent [customer
     * segments](https://help.shopify.com/manual/customers/customer-segments) that
     * merchants have built in the Shopify admin.
     */
    public Builder savedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    /**
     * The IDs of the discounts to deactivate.
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
      this.fieldsSet.add("ids");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
