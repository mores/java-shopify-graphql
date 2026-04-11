package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Adds tags to multiple
 * [discounts](https://help.shopify.com/manual/discounts/discount-types)
 * asynchronously using one of the following:
 * - A search query
 * - A saved search ID
 * - A list of discount IDs
 *   
 * For example, you can add tags to price rules that match a search criteria, or add tags to a predefined set of price rules.
 */
public class DiscountBulkTagsAddGraphQLQuery extends GraphQLQuery {
  public DiscountBulkTagsAddGraphQLQuery(String search, String savedSearchId, List<String> ids,
      List<String> tags, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }if (tags != null || fieldsSet.contains("tags")) {
        getInput().put("tags", tags);
    }
  }

  public DiscountBulkTagsAddGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountBulkTagsAdd";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String search;

    private String savedSearchId;

    private List<String> ids;

    private List<String> tags;

    private String queryName;

    public DiscountBulkTagsAddGraphQLQuery build() {
      return new DiscountBulkTagsAddGraphQLQuery(search, savedSearchId, ids, tags, queryName, fieldsSet);
               
    }

    /**
     * The search query for filtering discounts.
     * <br><br>
     * For more information on the list of supported fields and search syntax, refer to the [`discountNodes`](https://shopify.dev/docs/api/admin-graphql/latest/queries/discountNodes#query-arguments) query.
     */
    public Builder search(String search) {
      this.search = search;
      this.fieldsSet.add("search");
      return this;
    }

    /**
     * The ID of the saved search for filtering discounts to tag.
     */
    public Builder savedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    /**
     * The IDs of the discounts to tag.
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
      this.fieldsSet.add("ids");
      return this;
    }

    /**
     * The tags to add to the discounts.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      this.fieldsSet.add("tags");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
