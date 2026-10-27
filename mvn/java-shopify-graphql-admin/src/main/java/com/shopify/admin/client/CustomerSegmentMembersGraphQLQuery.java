package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import graphql.language.VariableDefinition;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * A paginated list of customers that belong to an individual [`Segment`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Segment).
 * Segments group customers based on criteria defined through [ShopifyQL queries](https://shopify.dev/docs/api/shopifyql/segment-query-language-reference).
 * Access segment members with their profile information and purchase summary
 * data. The connection includes statistics for analyzing segment attributes
 * (such as average and sum calculations) and a total count of all members.
 * The maximum page size is 1000.
 */
public class CustomerSegmentMembersGraphQLQuery extends GraphQLQuery {
  public CustomerSegmentMembersGraphQLQuery(String segmentId, String query, String queryId,
      String timezone, Boolean reverse, String sortKey, Integer first, String after, Integer last,
      String before, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (segmentId != null || fieldsSet.contains("segmentId")) {
        getInput().put("segmentId", segmentId);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (queryId != null || fieldsSet.contains("queryId")) {
        getInput().put("queryId", queryId);
    }if (timezone != null || fieldsSet.contains("timezone")) {
        getInput().put("timezone", timezone);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }if (sortKey != null || fieldsSet.contains("sortKey")) {
        getInput().put("sortKey", sortKey);
    }if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }
  }

  public CustomerSegmentMembersGraphQLQuery(String segmentId, String query, String queryId,
      String timezone, Boolean reverse, String sortKey, Integer first, String after, Integer last,
      String before, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (segmentId != null || fieldsSet.contains("segmentId")) {
        getInput().put("segmentId", segmentId);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (queryId != null || fieldsSet.contains("queryId")) {
        getInput().put("queryId", queryId);
    }if (timezone != null || fieldsSet.contains("timezone")) {
        getInput().put("timezone", timezone);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }if (sortKey != null || fieldsSet.contains("sortKey")) {
        getInput().put("sortKey", sortKey);
    }if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CustomerSegmentMembersGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "customerSegmentMembers";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String segmentId;

    private String query;

    private String queryId;

    private String timezone;

    private Boolean reverse;

    private String sortKey;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private String queryName;

    public CustomerSegmentMembersGraphQLQuery build() {
      return new CustomerSegmentMembersGraphQLQuery(segmentId, query, queryId, timezone, reverse, sortKey, first, after, last, before, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the segment.
     */
    public Builder segmentId(String segmentId) {
      this.segmentId = segmentId;
      this.fieldsSet.add("segmentId");
      return this;
    }

    /**
     * The ID of the segment.
     */
    public Builder segmentIdReference(String variableRef) {
      this.variableReferences.put("segmentId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ID")).build());
      this.fieldsSet.add("segmentId");
      return this;
    }

    /**
     * The query that's used to filter the members. The query is composed of a
     * combination of conditions on facts about customers such as
     * `email_subscription_status = 'SUBSCRIBED'` with [this
     * syntax](https://shopify.dev/api/shopifyql/segment-query-language-reference).
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    /**
     * The query that's used to filter the members. The query is composed of a
     * combination of conditions on facts about customers such as
     * `email_subscription_status = 'SUBSCRIBED'` with [this
     * syntax](https://shopify.dev/api/shopifyql/segment-query-language-reference).
     */
    public Builder queryReference(String variableRef) {
      this.variableReferences.put("query", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("query");
      return this;
    }

    /**
     * The ID of the segment members query.
     */
    public Builder queryId(String queryId) {
      this.queryId = queryId;
      this.fieldsSet.add("queryId");
      return this;
    }

    /**
     * The ID of the segment members query.
     */
    public Builder queryIdReference(String variableRef) {
      this.variableReferences.put("queryId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ID")).build());
      this.fieldsSet.add("queryId");
      return this;
    }

    /**
     * The timezone that's used to interpret relative date arguments. The timezone
     * defaults to UTC if the timezone isn't provided.
     */
    public Builder timezone(String timezone) {
      this.timezone = timezone;
      this.fieldsSet.add("timezone");
      return this;
    }

    /**
     * The timezone that's used to interpret relative date arguments. The timezone
     * defaults to UTC if the timezone isn't provided.
     */
    public Builder timezoneReference(String variableRef) {
      this.variableReferences.put("timezone", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("timezone");
      return this;
    }

    /**
     * Reverse the order of the list. The sorting behaviour defaults to ascending order.
     */
    public Builder reverse(Boolean reverse) {
      this.reverse = reverse;
      this.fieldsSet.add("reverse");
      return this;
    }

    /**
     * Reverse the order of the list. The sorting behaviour defaults to ascending order.
     */
    public Builder reverseReference(String variableRef) {
      this.variableReferences.put("reverse", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
      this.fieldsSet.add("reverse");
      return this;
    }

    /**
     * Sort the list by a given key. Valid values:
     * • `created_at` - Sort by customer creation date
     * • `first_order_date` - Sort by the date of the customer's first order
     * • `last_abandoned_order_date` - Sort by the date of the customer's last abandoned checkout
     * • `last_order_date` - Sort by the date of the customer's most recent order
     * • `number_of_orders` - Sort by the total number of orders placed by the customer
     * • `amount_spent` - Sort by the total amount the customer has spent across all orders
     *     
     * Use with the `reverse` parameter to control sort direction (ascending by default, descending when reverse=true).
     */
    public Builder sortKey(String sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
      return this;
    }

    /**
     * Sort the list by a given key. Valid values:
     * • `created_at` - Sort by customer creation date
     * • `first_order_date` - Sort by the date of the customer's first order
     * • `last_abandoned_order_date` - Sort by the date of the customer's last abandoned checkout
     * • `last_order_date` - Sort by the date of the customer's most recent order
     * • `number_of_orders` - Sort by the total number of orders placed by the customer
     * • `amount_spent` - Sort by the total amount the customer has spent across all orders
     *     
     * Use with the `reverse` parameter to control sort direction (ascending by default, descending when reverse=true).
     */
    public Builder sortKeyReference(String variableRef) {
      this.variableReferences.put("sortKey", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("sortKey");
      return this;
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
     * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder firstReference(String variableRef) {
      this.variableReferences.put("first", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Int")).build());
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
     * The elements that come after the specified [cursor](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder afterReference(String variableRef) {
      this.variableReferences.put("after", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
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
     * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder lastReference(String variableRef) {
      this.variableReferences.put("last", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Int")).build());
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
     * The elements that come before the specified [cursor](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder beforeReference(String variableRef) {
      this.variableReferences.put("before", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("before");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
