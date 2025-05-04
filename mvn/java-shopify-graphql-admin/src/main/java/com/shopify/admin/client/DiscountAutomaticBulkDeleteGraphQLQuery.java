package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Asynchronously delete automatic discounts in bulk if a `search` or `saved_search_id` argument is provided or if a
 * maximum discount threshold is reached (1,000). Otherwise, deletions will occur inline.
 * **Warning:** All automatic discounts will be deleted if a blank `search` argument is provided.
 */
public class DiscountAutomaticBulkDeleteGraphQLQuery extends GraphQLQuery {
  public DiscountAutomaticBulkDeleteGraphQLQuery(String search, String savedSearchId,
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

  public DiscountAutomaticBulkDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountAutomaticBulkDelete";
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

    public DiscountAutomaticBulkDeleteGraphQLQuery build() {
      return new DiscountAutomaticBulkDeleteGraphQLQuery(search, savedSearchId, ids, queryName, fieldsSet);
               
    }

    /**
     * The search query for filtering automatic discounts to delete.
     *     
     * For more information on the list of supported fields and search syntax,
     * refer to the [AutomaticDiscountNodes query section](https://shopify.dev/api/admin-graphql/latest/queries/automaticDiscountNodes#argument-automaticdiscountnodes-query).
     */
    public Builder search(String search) {
      this.search = search;
      this.fieldsSet.add("search");
      return this;
    }

    /**
     * The ID of the saved search to use for filtering automatic discounts to delete.
     */
    public Builder savedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    /**
     * The IDs of the automatic discounts to delete.
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
