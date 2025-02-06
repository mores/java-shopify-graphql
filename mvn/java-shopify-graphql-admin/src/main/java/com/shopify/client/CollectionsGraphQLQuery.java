package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CollectionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a list of collections.
 */
public class CollectionsGraphQLQuery extends GraphQLQuery {
  public CollectionsGraphQLQuery(Integer first, String after, Integer last, String before,
      Boolean reverse, CollectionSortKeys sortKey, String query, String savedSearchId,
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

  public CollectionsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "collections";
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

    private CollectionSortKeys sortKey;

    private String query;

    private String savedSearchId;

    private String queryName;

    public CollectionsGraphQLQuery build() {
      return new CollectionsGraphQLQuery(first, after, last, before, reverse, sortKey, query, savedSearchId, queryName, fieldsSet);
               
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
    public Builder sortKey(CollectionSortKeys sortKey) {
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
     * | collection_type | string | | - `custom`<br/> - `smart` |
     * | handle | string |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:&lt;=1234` |
     * | product_id | id | Filter by collections containing a product by its ID. |
     * | product_publication_status | string | Filter by the publishable status of
     * the resource on a channel, such as the online store. The value is a
     * composite of the [channel `app`
     * ID](https://shopify.dev/api/admin-graphql/latest/objects/Channel#app-price)
     * (`Channel.app.id`) and one of the valid values. | - `approved`<br/> -
     * `rejected`<br/> - `needs_action`<br/> - `awaiting_review`<br/> -
     * `published`<br/> - `demoted`<br/> - `scheduled`<br/> -
     * `provisionally_published` | | - `publishable_status:189769876-approved` |
     * | publishable_status | string | Filter by the publishable status of the
     * resource on a channel, such as the online store. The value is a composite of
     * either the [channel `app`
     * ID](https://shopify.dev/api/admin-graphql/latest/objects/Channel#app-price)
     * (`Channel.app.id`) or [channel `name`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel#field-name)
     * and one of the valid values. | - `online_store_channel`<br/> -
     * `published`<br/> - `unpublished`<br/> - `visible`<br/> - `unavailable`<br/>
     * - `hidden`<br/> - `intended`<br/> - `visible` | | -
     * `publishable_status:published`<br/> -
     * `publishable_status:189769876:visible`<br/> -
     * `publishable_status:pos:hidden` |
     * | published_at | time | Filter by the date and time when the collection was published to the Online Store. |
     * | published_status | string | Filter by the published status of the resource
     * on a channel, such as the online store. | - `unset`<br/> - `pending`<br/> -
     * `approved`<br/> - `not approved` | | - `published_status:approved` |
     * | title | string |
     * | updated_at | time |
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
