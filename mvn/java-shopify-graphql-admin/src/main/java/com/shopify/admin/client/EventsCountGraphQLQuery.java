package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Count of events. Limited to a maximum of 10000.
 */
public class EventsCountGraphQLQuery extends GraphQLQuery {
  public EventsCountGraphQLQuery(String query, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }
  }

  public EventsCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "eventsCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String query;

    private String queryName;

    public EventsCountGraphQLQuery build() {
      return new EventsCountGraphQLQuery(query, queryName, fieldsSet);
               
    }

    /**
     * A filter made up of terms, connectives, modifiers, and comparators.
     * | name | type | description | acceptable_values | default_value | example_use |
     * | ---- | ---- | ---- | ---- | ---- | ---- |
     * | action | string | The action that occured. | | | - `action:create` |
     * | comments | boolean | Whether or not to include [comment-events](https://shopify.dev/api/admin-graphql/latest/objects/CommentEvent)
     * in your search, passing `false` will exclude comment-events, any other value
     * will include comment-events. | | | - `false`<br/> - `true` |
     * | created_at | time | Filter by the date and time when the event happened. |
     * | | - `created_at:>2020-10-21`<br/> - `created_at:&lt;now` |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:&lt;=1234` |
     * | subject_type | string | The resource type affected by this event. See [EventSubjectType](https://shopify.dev/api/admin-graphql/latest/enums/EventSubjectType)
     * for possible values. | | | - `PRODUCT_VARIANT`<br/> - `PRODUCT`<br/> - `COLLECTION` |
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
