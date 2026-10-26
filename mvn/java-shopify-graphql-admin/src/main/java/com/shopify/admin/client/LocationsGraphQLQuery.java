package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.LocationSortKeys;
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
 * A paginated list of inventory locations where merchants can stock
 * [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
 * items and fulfill
 * [`Order`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order) items.
 *   
 * Returns only active locations by default. Use the [`includeInactive`](https://shopify.dev/docs/api/admin-graphql/latest/queries/locations#arguments-includeInactive)
 * argument to retrieve deactivated locations that can no longer stock inventory
 * or fulfill orders. Use the [`includeLegacy`](https://shopify.dev/docs/api/admin-graphql/latest/queries/locations#arguments-includeLegacy)
 * argument to include locations that [`FulfillmentService`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentService)
 * apps manage. Use the [`query`](https://shopify.dev/docs/api/admin-graphql/latest/queries/locations#arguments-query)
 * argument to filter by location attributes like name, address, and whether
 * local pickup is enabled.
 */
public class LocationsGraphQLQuery extends GraphQLQuery {
  public LocationsGraphQLQuery(Boolean includeLegacy, Boolean includeInactive, Integer first,
      String after, Integer last, String before, Boolean reverse, LocationSortKeys sortKey,
      String query, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (includeLegacy != null || fieldsSet.contains("includeLegacy")) {
        getInput().put("includeLegacy", includeLegacy);
    }if (includeInactive != null || fieldsSet.contains("includeInactive")) {
        getInput().put("includeInactive", includeInactive);
    }if (first != null || fieldsSet.contains("first")) {
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

  public LocationsGraphQLQuery(Boolean includeLegacy, Boolean includeInactive, Integer first,
      String after, Integer last, String before, Boolean reverse, LocationSortKeys sortKey,
      String query, String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (includeLegacy != null || fieldsSet.contains("includeLegacy")) {
        getInput().put("includeLegacy", includeLegacy);
    }if (includeInactive != null || fieldsSet.contains("includeInactive")) {
        getInput().put("includeInactive", includeInactive);
    }if (first != null || fieldsSet.contains("first")) {
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
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public LocationsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "locations";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private Boolean includeLegacy;

    private Boolean includeInactive;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private LocationSortKeys sortKey;

    private String query;

    private String queryName;

    public LocationsGraphQLQuery build() {
      return new LocationsGraphQLQuery(includeLegacy, includeInactive, first, after, last, before, reverse, sortKey, query, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Whether to include the legacy locations of fulfillment services.
     */
    public Builder includeLegacy(Boolean includeLegacy) {
      this.includeLegacy = includeLegacy;
      this.fieldsSet.add("includeLegacy");
      return this;
    }

    /**
     * Whether to include the legacy locations of fulfillment services.
     */
    public Builder includeLegacyReference(String variableRef) {
      this.variableReferences.put("includeLegacy", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
      this.fieldsSet.add("includeLegacy");
      return this;
    }

    /**
     * Whether to include the locations that are deactivated.
     */
    public Builder includeInactive(Boolean includeInactive) {
      this.includeInactive = includeInactive;
      this.fieldsSet.add("includeInactive");
      return this;
    }

    /**
     * Whether to include the locations that are deactivated.
     */
    public Builder includeInactiveReference(String variableRef) {
      this.variableReferences.put("includeInactive", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
      this.fieldsSet.add("includeInactive");
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

    /**
     * Reverse the order of the underlying list.
     */
    public Builder reverse(Boolean reverse) {
      this.reverse = reverse;
      this.fieldsSet.add("reverse");
      return this;
    }

    /**
     * Reverse the order of the underlying list.
     */
    public Builder reverseReference(String variableRef) {
      this.variableReferences.put("reverse", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
      this.fieldsSet.add("reverse");
      return this;
    }

    /**
     * Sort the underlying list using a key. If your query is slow or returns an
     * error, then [try specifying a sort key that matches the field used in the search](https://shopify.dev/api/usage/pagination-graphql#search-performance-considerations).
     */
    public Builder sortKey(LocationSortKeys sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
      return this;
    }

    /**
     * Sort the underlying list using a key. If your query is slow or returns an
     * error, then [try specifying a sort key that matches the field used in the search](https://shopify.dev/api/usage/pagination-graphql#search-performance-considerations).
     */
    public Builder sortKeyReference(String variableRef) {
      this.variableReferences.put("sortKey", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("LocationSortKeys")).build());
      this.fieldsSet.add("sortKey");
      return this;
    }

    /**
     * A filter made up of terms, connectives, modifiers, and comparators.
     * | name | type | description | acceptable_values | default_value | example_use |
     * | ---- | ---- | ---- | ---- | ---- | ---- |
     * | default | string | Filter by a case-insensitive search of multiple fields
     * in a document. | | | - `query=Bob Norman`<br/> - `query=title:green hoodie` |
     * | active | string |
     * | address1 | string |
     * | address2 | string |
     * | city | string |
     * | country | string |
     * | created_at | time |
     * | geolocated | boolean |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:&lt;=1234` |
     * | legacy | boolean |
     * | location_id | id |
     * | name | string |
     * | pickup_in_store | string | | - `enabled`<br/> - `disabled` |
     * | province | string |
     * | zip | string |
     * You can apply one or more filters to a query. Learn more about [Shopify API
     * search syntax](https://shopify.dev/api/usage/search-syntax).
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    /**
     * A filter made up of terms, connectives, modifiers, and comparators.
     * | name | type | description | acceptable_values | default_value | example_use |
     * | ---- | ---- | ---- | ---- | ---- | ---- |
     * | default | string | Filter by a case-insensitive search of multiple fields
     * in a document. | | | - `query=Bob Norman`<br/> - `query=title:green hoodie` |
     * | active | string |
     * | address1 | string |
     * | address2 | string |
     * | city | string |
     * | country | string |
     * | created_at | time |
     * | geolocated | boolean |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:&lt;=1234` |
     * | legacy | boolean |
     * | location_id | id |
     * | name | string |
     * | pickup_in_store | string | | - `enabled`<br/> - `disabled` |
     * | province | string |
     * | zip | string |
     * You can apply one or more filters to a query. Learn more about [Shopify API
     * search syntax](https://shopify.dev/api/usage/search-syntax).
     */
    public Builder queryReference(String variableRef) {
      this.variableReferences.put("query", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("query");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
