package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Deletes multiple automatic discounts in a single operation, providing
 * efficient bulk management for stores with extensive discount catalogs. This
 * mutation processes deletions asynchronously to handle large volumes without
 * blocking other operations.
 *   
 * For example, when cleaning up expired seasonal promotions or removing outdated
 * automatic discounts across product categories, merchants can delete dozens of
 * discounts simultaneously rather than processing each individually.
 *   
 * Use `DiscountAutomaticBulkDelete` to:
 * - Remove multiple automatic discounts efficiently
 * - Clean up expired or obsolete promotions
 * - Streamline discount management workflows
 * - Process large-scale discount removals asynchronously
 *   
 * The operation returns a job object for tracking deletion progress and any validation errors encountered during processing.
 *   
 * Learn more about [discount management](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountAutomatic).
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
