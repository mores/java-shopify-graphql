package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Asynchronously delete discount redeem codes in bulk. Specify the redeem codes to delete by providing a
 * search query, a saved search ID, or a list of redeem code IDs.
 */
public class DiscountCodeRedeemCodeBulkDeleteGraphQLQuery extends GraphQLQuery {
  public DiscountCodeRedeemCodeBulkDeleteGraphQLQuery(String discountId, String search,
      String savedSearchId, List<String> ids, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (discountId != null || fieldsSet.contains("discountId")) {
        getInput().put("discountId", discountId);
    }if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }
  }

  public DiscountCodeRedeemCodeBulkDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeRedeemCodeBulkDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String discountId;

    private String search;

    private String savedSearchId;

    private List<String> ids;

    private String queryName;

    public DiscountCodeRedeemCodeBulkDeleteGraphQLQuery build() {
      return new DiscountCodeRedeemCodeBulkDeleteGraphQLQuery(discountId, search, savedSearchId, ids, queryName, fieldsSet);
               
    }

    /**
     * The ID of the redeem code's discount.
     */
    public Builder discountId(String discountId) {
      this.discountId = discountId;
      this.fieldsSet.add("discountId");
      return this;
    }

    /**
     * The search query for filtering discount redeem codes.
     */
    public Builder search(String search) {
      this.search = search;
      this.fieldsSet.add("search");
      return this;
    }

    /**
     * The ID of the saved search.
     */
    public Builder savedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    /**
     * The IDs of the discount redeem codes to delete.
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
