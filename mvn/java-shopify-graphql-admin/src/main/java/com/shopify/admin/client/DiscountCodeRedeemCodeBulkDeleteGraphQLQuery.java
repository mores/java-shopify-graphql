package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Asynchronously delete
 * [discount codes](https://help.shopify.com/manual/discounts/discount-types#discount-codes)
 * in bulk that customers can use to redeem a discount.
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
     * The ID of the
     * [`DiscountCodeNode`](https://help.shopify.com/docs/api/admin-graphql/latest/objects/DiscountCodeNode#field-id)
     * object that the codes will be removed from. For example, `gid://shopify/DiscountCodeNode/123`.
     * You can use the
     * [`codeDiscountNodes` query](https://shopify.dev/docs/api/admin-graphql/latest/queries/codeDiscountNodes)
     * to retrieve the ID.
     */
    public Builder discountId(String discountId) {
      this.discountId = discountId;
      this.fieldsSet.add("discountId");
      return this;
    }

    /**
     * A filter made up of terms, connectives, modifiers, and comparators that you can use to
     * search for code discounts. You can apply one or more filters to a query. Learn more about
     * [Shopify API search syntax](https://shopify.dev/docs/api/usage/search-syntax).
     *     
     * For a list of accepted values for the `search` field, refer to the
     * [`query` argument on the `codeDiscountNodes` query](https://shopify.dev/docs/api/admin-graphql/latest/queries/codeDiscountNodes#argument-query).
     */
    public Builder search(String search) {
      this.search = search;
      this.fieldsSet.add("search");
      return this;
    }

    /**
     * The ID of a
     * [saved search](https://shopify.dev/docs/api/admin-graphql/latest/objects/savedsearch#field-id).
     */
    public Builder savedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    /**
     * The IDs of the
     * [`DiscountRedeemCode`](https://shopify.dev/docs/api/admin-graphql/latest/objects/discountredeemcode#field-id)
     * objects to delete.
     * For example, `gid://shopify/DiscountRedeemCode/123`.
     * You can use the
     * [`codeDiscountNodes` query](https://shopify.dev/docs/api/admin-graphql/latest/queries/codeDiscountNodes)
     * to retrieve the ID.
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
