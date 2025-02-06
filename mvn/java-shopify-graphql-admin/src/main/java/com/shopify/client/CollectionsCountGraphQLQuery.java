package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Count of collections. Limited to a maximum of 10000.
 */
public class CollectionsCountGraphQLQuery extends GraphQLQuery {
  public CollectionsCountGraphQLQuery(String query, String savedSearchId, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }
  }

  public CollectionsCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "collectionsCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String query;

    private String savedSearchId;

    private String queryName;

    public CollectionsCountGraphQLQuery build() {
      return new CollectionsCountGraphQLQuery(query, savedSearchId, queryName, fieldsSet);
               
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
     * The ID of an existing saved search.
     * The search’s query string is used as the query argument.
     * Refer to the [`SavedSearch`](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch) object.
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
