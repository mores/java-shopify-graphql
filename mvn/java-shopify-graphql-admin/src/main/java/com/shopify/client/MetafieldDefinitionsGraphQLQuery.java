package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MetafieldDefinitionConstraintStatus;
import com.shopify.types.MetafieldDefinitionConstraintSubtypeIdentifier;
import com.shopify.types.MetafieldDefinitionPinnedStatus;
import com.shopify.types.MetafieldDefinitionSortKeys;
import com.shopify.types.MetafieldOwnerType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a list of metafield definitions.
 */
public class MetafieldDefinitionsGraphQLQuery extends GraphQLQuery {
  public MetafieldDefinitionsGraphQLQuery(String key, String namespace,
      MetafieldOwnerType ownerType, MetafieldDefinitionPinnedStatus pinnedStatus,
      MetafieldDefinitionConstraintSubtypeIdentifier constraintSubtype,
      MetafieldDefinitionConstraintStatus constraintStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (key != null || fieldsSet.contains("key")) {
        getInput().put("key", key);
    }if (namespace != null || fieldsSet.contains("namespace")) {
        getInput().put("namespace", namespace);
    }if (ownerType != null || fieldsSet.contains("ownerType")) {
        getInput().put("ownerType", ownerType);
    }if (pinnedStatus != null || fieldsSet.contains("pinnedStatus")) {
        getInput().put("pinnedStatus", pinnedStatus);
    }if (constraintSubtype != null || fieldsSet.contains("constraintSubtype")) {
        getInput().put("constraintSubtype", constraintSubtype);
    }if (constraintStatus != null || fieldsSet.contains("constraintStatus")) {
        getInput().put("constraintStatus", constraintStatus);
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

  public MetafieldDefinitionsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "metafieldDefinitions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String key;

    private String namespace;

    private MetafieldOwnerType ownerType;

    private MetafieldDefinitionPinnedStatus pinnedStatus;

    private MetafieldDefinitionConstraintSubtypeIdentifier constraintSubtype;

    private MetafieldDefinitionConstraintStatus constraintStatus;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private MetafieldDefinitionSortKeys sortKey;

    private String query;

    private String queryName;

    public MetafieldDefinitionsGraphQLQuery build() {
      return new MetafieldDefinitionsGraphQLQuery(key, namespace, ownerType, pinnedStatus, constraintSubtype, constraintStatus, first, after, last, before, reverse, sortKey, query, queryName, fieldsSet);
               
    }

    /**
     * Filter metafield definition by key.
     */
    public Builder key(String key) {
      this.key = key;
      this.fieldsSet.add("key");
      return this;
    }

    /**
     * Filter metafield definition by namespace.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      this.fieldsSet.add("namespace");
      return this;
    }

    /**
     * Filter the metafield definition by the specific owner type.
     */
    public Builder ownerType(MetafieldOwnerType ownerType) {
      this.ownerType = ownerType;
      this.fieldsSet.add("ownerType");
      return this;
    }

    /**
     * Filter the metafield definition by the pinned status.
     */
    public Builder pinnedStatus(MetafieldDefinitionPinnedStatus pinnedStatus) {
      this.pinnedStatus = pinnedStatus;
      this.fieldsSet.add("pinnedStatus");
      return this;
    }

    /**
     * Filter metafield definitions based on whether they apply to a given resource subtype.
     */
    public Builder constraintSubtype(
        MetafieldDefinitionConstraintSubtypeIdentifier constraintSubtype) {
      this.constraintSubtype = constraintSubtype;
      this.fieldsSet.add("constraintSubtype");
      return this;
    }

    /**
     * Filter metafield definitions based on whether they are constrained.
     */
    public Builder constraintStatus(MetafieldDefinitionConstraintStatus constraintStatus) {
      this.constraintStatus = constraintStatus;
      this.fieldsSet.add("constraintStatus");
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
    public Builder sortKey(MetafieldDefinitionSortKeys sortKey) {
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
     * | created_at | time | Filter by the date and time when the metafield
     * definition was created. | | | - `created_at:>2020-10-21T23:39:20Z`<br/> -
     * `created_at:&lt;now`<br/> - `created_at:&lt;=2024` |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:&lt;=1234` |
     * | key | string | Filter by the metafield definition [`key`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MetafieldDefinition#field-key)
     * field. | | | - `key:some-key` |
     * | namespace | string | Filter by the metafield definition [`namespace`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MetafieldDefinition#field-namespace)
     * field. | | | - `namespace:some-namespace` |
     * | owner_type | string | Filter by the metafield definition [`ownerType`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MetafieldDefinition#field-ownertype)
     * field. | | | - `owner_type:PRODUCT` |
     * | type | string | Filter by the metafield definition [`type`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MetafieldDefinition#field-type)
     * field. | | | - `type:single_line_text_field` |
     * | updated_at | time | Filter by the date and time when the metafield
     * definition was last updated. | | | - `updated_at:>2020-10-21T23:39:20Z`<br/>
     * - `updated_at:&lt;now`<br/> - `updated_at:&lt;=2024` |
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
