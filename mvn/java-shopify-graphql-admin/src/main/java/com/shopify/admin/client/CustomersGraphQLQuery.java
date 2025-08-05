package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CustomerSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a list of
 * [customers](https://shopify.dev/api/admin-graphql/latest/objects/Customer) in
 * your Shopify store, including key information such as name, email, location,
 * and purchase history.
 * Use this query to segment your audience, personalize marketing campaigns, or
 * analyze customer behavior by applying filters based on location, order
 * history, marketing preferences and tags.
 * The `customers` query supports
 * [pagination](https://shopify.dev/api/usage/pagination-graphql) and [sorting](https://shopify.dev/api/admin-graphql/latest/enums/CustomerSortKeys).
 */
public class CustomersGraphQLQuery extends GraphQLQuery {
  public CustomersGraphQLQuery(Integer first, String after, Integer last, String before,
      Boolean reverse, CustomerSortKeys sortKey, String query, String queryName,
      Set<String> fieldsSet) {
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
    }
  }

  public CustomersGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "customers";
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

    private CustomerSortKeys sortKey;

    private String query;

    private String queryName;

    public CustomersGraphQLQuery build() {
      return new CustomersGraphQLQuery(first, after, last, before, reverse, sortKey, query, queryName, fieldsSet);
               
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
    public Builder sortKey(CustomerSortKeys sortKey) {
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
     * | accepts_marketing | boolean | Filter by whether a customer has consented
     * to receive marketing material. | | | - `accepts_marketing:true` |
     * | country | string | Filter by the country associated with the customer's
     * address. Use either the country name or the two-letter country code. | | | -
     * `country:Canada`<br/> - `country:JP` |
     * | customer_date | time | Filter by the date and time when the customer
     * record was created. This query parameter filters by the [`createdAt`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer#field-createdAt)
     * field. | | | - `customer_date:'2024-03-15T14:30:00Z'`<br/> -
     * `customer_date:'>=2024-01-01'` |
     * | email | string | The customer's email address, used to communicate
     * information about orders and for the purposes of email marketing campaigns.
     * You can use a wildcard value to filter the query by customers who have an
     * email address specified. Please note that _email_ is a tokenized field: To
     * retrieve exact matches, quote the email address (_phrase query_) as
     * described in [Shopify API search
     * syntax](https://shopify.dev/docs/api/usage/search-syntax). | | | -
     * `email:gmail.com`<br/> - `email:"bo.wang@example.com"`<br/> - `email:*` |
     * | first_name | string | Filter by the customer's first name. | | | - `first_name:Jane` |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:&lt;=1234` |
     * | last_abandoned_order_date | time | Filter by the date and time of the
     * customer's most recent abandoned checkout. An abandoned checkout occurs when
     * a customer adds items to their cart, begins the checkout process, but leaves
     * the site without completing their purchase. | | | -
     * `last_abandoned_order_date:'2024-04-01T10:00:00Z'`<br/> -
     * `last_abandoned_order_date:'>=2024-01-01'` |
     * | last_name | string | Filter by the customer's last name. | | | - `last_name:Reeves` |
     * | order_date | time | Filter by the date and time that the order was placed
     * by the customer. Use this query filter to check if a customer has placed at
     * least one order within a specified date range. | | | -
     * `order_date:'2024-02-20T00:00:00Z'`<br/> - `order_date:'>=2024-01-01'`<br/>
     * - `order_date:'2024-01-01..2024-03-31'` |
     * | orders_count | integer | Filter by the total number of orders a customer has placed. | | | - `orders_count:5` |
     * | phone | string | The phone number of the customer, used to communicate
     * information about orders and for the purposes of SMS marketing campaigns.
     * You can use a wildcard value to filter the query by customers who have a
     * phone number specified. | | | - `phone:+18005550100`<br/> - `phone:*` |
     * | state | string | Filter by the [state](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer#field-state)
     * of the customer's account with the shop. This filter is only valid when
     * [Classic Customer Accounts](https://shopify.dev/docs/api/admin-graphql/latest/objects/CustomerAccountsV2#field-customerAccountsVersion)
     * is active. | | | - `state:ENABLED`<br/> - `state:INVITED`<br/> -
     * `state:DISABLED`<br/> - `state:DECLINED` |
     * | tag | string | Filter by the tags that are associated with the customer.
     * This query parameter accepts multiple tags separated by commas. | | | -
     * `tag:'VIP'`<br/> - `tag:'Wholesale,Repeat'` |
     * | tag_not | string | Filter by the tags that aren't associated with the
     * customer. This query parameter accepts multiple tags separated by commas. |
     * | | - `tag_not:'Prospect'`<br/> - `tag_not:'Test,Internal'` |
     * | total_spent | float | Filter by the total amount of money a customer has
     * spent across all orders. | | | - `total_spent:100.50`<br/> -
     * `total_spent:50.00`<br/> - `total_spent:>100.50`<br/> - `total_spent:>50.00` |
     * | updated_at | time | The date and time, matching a whole day, when the
     * customer's information was last updated. | | | -
     * `updated_at:2024-01-01T00:00:00Z`<br/> - `updated_at:&lt;now`<br/> -
     * `updated_at:&lt;=2024` |
     * You can apply one or more filters to a query. Learn more about [Shopify API
     * search syntax](https://shopify.dev/api/usage/search-syntax).
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
