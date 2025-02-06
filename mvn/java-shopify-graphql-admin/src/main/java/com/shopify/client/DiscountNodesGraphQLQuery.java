package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DiscountSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a list of discounts.
 */
public class DiscountNodesGraphQLQuery extends GraphQLQuery {
  public DiscountNodesGraphQLQuery(Integer first, String after, Integer last, String before,
      Boolean reverse, DiscountSortKeys sortKey, String query, String savedSearchId,
      String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }if (sortKey != null || fieldsSet.contains("sortKey")) {
        getInput().put("sortKey", sortKey);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }
  }

  public DiscountNodesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "discountNodes";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private DiscountSortKeys sortKey;

    private String query;

    private String savedSearchId;

    private String queryName;

    public DiscountNodesGraphQLQuery build() {
      return new DiscountNodesGraphQLQuery(first, after, last, before, reverse, sortKey, query, savedSearchId, queryName, fieldsSet);
               
    }

    /**
     * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder first(Integer first) {
      this.first = first;
      this.fieldsSet.add("first");
      return this;
    }

    /**
     * The elements that come after the specified [cursor](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder after(String after) {
      this.after = after;
      this.fieldsSet.add("after");
      return this;
    }

    /**
     * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder last(Integer last) {
      this.last = last;
      this.fieldsSet.add("last");
      return this;
    }

    /**
     * The elements that come before the specified [cursor](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder before(String before) {
      this.before = before;
      this.fieldsSet.add("before");
      return this;
    }

    /**
     * Reverse the order of the underlying list.
     */
    public Builder reverse(Boolean reverse) {
      this.reverse = reverse;
      this.fieldsSet.add("reverse");
      return this;
    }

    /**
     * Sort the underlying list using a key. If your query is slow or returns an
     * error, then [try specifying a sort key that matches the field used in the search](https://shopify.dev/api/usage/pagination-graphql#search-performance-considerations).
     */
    public Builder sortKey(DiscountSortKeys sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
      return this;
    }

    /**
     * A filter made up of terms, connectives, modifiers, and comparators.
     * | name | type | description | acceptable_values | default_value | example_use |
     * | ---- | ---- | ---- | ---- | ---- | ---- |
     * | default | string | Filter by a case-insensitive search of multiple fields
     * in a document. | | | - `query=Bob Norman`<br/> - `query=title:green hoodie` |
     * | code | string | Filter by the discount code. Not supported for bulk discounts. | | | - `code:WELCOME10` |
     * | combines_with | string | Filter by the [Shopify Functions discount
     * classes](https://shopify.dev/docs/apps/build/discounts#discount-classes)
     * that the [discount type](https://shopify.dev/docs/api/admin-graphql/latest/queries/discountnodes#argument-query-filter-discount_type)
     * can combine with. | - `order_discounts`<br/> - `product_discounts`<br/> -
     * `shipping_discounts` | | - `combines_with:product_discounts` |
     * | discount_class | string | Filter by the [discount
     * class](https://shopify.dev/docs/apps/build/discounts#discount-classes). | -
     * `order`<br/> - `product`<br/> - `shipping` | | - `discount_class:product` |
     * | discount_type | string | Filter by the [discount
     * type](https://help.shopify.com/manual/discounts/discount-types). | -
     * `bogo`<br/> - `fixed_amount`<br/> - `free_shipping`<br/> - `percentage` | |
     * - `type:fixed_amount` |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:&lt;=1234` |
     * | method | string | Filter by the [discount
     * method](https://shopify.dev/docs/apps/build/discounts#discount-methods). | -
     * `automatic`<br/> - `code` | | - `method:code` |
     * | starts_at | time | Filter by the date and time, in the shop's timezone,
     * when the discount becomes active and is available for customer use. | | | -
     * `starts_at:>'2020-10-21T23:39:20Z'`<br/> - `starts_at:&lt;now`<br/> -
     * `starts_at:&lt;='2024'` |
     * | status | string | Filter by the status of the discount. | - `active`<br/>
     * - `expired`<br/> - `scheduled` | | - `status:scheduled` |
     * | times_used | integer | Filter by the number of times the discount has been
     * used. For example, if a "Buy 3, Get 1 Free" t-shirt discount is
     * automatically applied in 200 transactions, then the discount has been used
     * 200 times. <br><br> This value is updated asynchronously. As a result, it
     * might be different than the actual usage count. | | | - `times_used:0`<br/>
     * - `times_used:>150`<br/> - `times_used:>=200` |
     * | title | string | Filter by the discount name that displays to merchants in
     * the Shopify admin and to customers. | | | - `title:Black Friday Sale` |
     * | type | string | Filter by the [discount
     * type](https://help.shopify.com/manual/discounts/discount-types). | -
     * `all`<br/> - `all_with_app`<br/> - `app`<br/> - `bxgy`<br/> -
     * `fixed_amount`<br/> - `free_shipping`<br/> - `percentage` | | -
     * `type:percentage` |
     * You can apply one or more filters to a query. Learn more about [Shopify API
     * search syntax](https://shopify.dev/api/usage/search-syntax).
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    /**
     * The ID of a [saved search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
     * The search’s query string is used as the query argument.
     */
    public Builder savedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
