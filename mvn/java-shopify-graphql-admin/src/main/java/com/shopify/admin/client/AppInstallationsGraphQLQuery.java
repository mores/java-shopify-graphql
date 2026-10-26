package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.AppInstallationCategory;
import com.shopify.admin.types.AppInstallationPrivacy;
import com.shopify.admin.types.AppInstallationSortKeys;
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
 * A paginated list of [`AppInstallation`](https://shopify.dev/docs/api/admin-graphql/latest/objects/AppInstallation)
 * objects across multiple stores where your app is installed. Use this query to
 * monitor installation status, track billing and subscriptions through [`AppSubscription`](https://shopify.dev/docs/api/admin-graphql/latest/objects/AppSubscription)
 * objects, and review granted [`AccessScope`](https://shopify.dev/docs/api/admin-graphql/latest/objects/AccessScope) objects.
 *   
 * Filter by [`AppInstallationCategory`](https://shopify.dev/docs/api/admin-graphql/latest/enums/AppInstallationCategory) to find specific types of installations (such as POS or channel apps) and by [`AppInstallationPrivacy`](https://shopify.dev/docs/api/admin-graphql/latest/enums/AppInstallationPrivacy)
 * to scope to public or private installations.
 */
public class AppInstallationsGraphQLQuery extends GraphQLQuery {
  public AppInstallationsGraphQLQuery(Integer first, String after, Integer last, String before,
      Boolean reverse, AppInstallationSortKeys sortKey, AppInstallationCategory category,
      AppInstallationPrivacy privacy, String queryName, Set<String> fieldsSet) {
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
    }if (category != null || fieldsSet.contains("category")) {
        getInput().put("category", category);
    }if (privacy != null || fieldsSet.contains("privacy")) {
        getInput().put("privacy", privacy);
    }
  }

  public AppInstallationsGraphQLQuery(Integer first, String after, Integer last, String before,
      Boolean reverse, AppInstallationSortKeys sortKey, AppInstallationCategory category,
      AppInstallationPrivacy privacy, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
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
    }if (category != null || fieldsSet.contains("category")) {
        getInput().put("category", category);
    }if (privacy != null || fieldsSet.contains("privacy")) {
        getInput().put("privacy", privacy);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public AppInstallationsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "appInstallations";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private AppInstallationSortKeys sortKey;

    private AppInstallationCategory category;

    private AppInstallationPrivacy privacy;

    private String queryName;

    public AppInstallationsGraphQLQuery build() {
      return new AppInstallationsGraphQLQuery(first, after, last, before, reverse, sortKey, category, privacy, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
    public Builder sortKey(AppInstallationSortKeys sortKey) {
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
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("AppInstallationSortKeys")).build());
      this.fieldsSet.add("sortKey");
      return this;
    }

    /**
     * The category of app installations to fetch.
     */
    public Builder category(AppInstallationCategory category) {
      this.category = category;
      this.fieldsSet.add("category");
      return this;
    }

    /**
     * The category of app installations to fetch.
     */
    public Builder categoryReference(String variableRef) {
      this.variableReferences.put("category", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("AppInstallationCategory")).build());
      this.fieldsSet.add("category");
      return this;
    }

    /**
     * The privacy level of app installations to fetch.
     */
    public Builder privacy(AppInstallationPrivacy privacy) {
      this.privacy = privacy;
      this.fieldsSet.add("privacy");
      return this;
    }

    /**
     * The privacy level of app installations to fetch.
     */
    public Builder privacyReference(String variableRef) {
      this.variableReferences.put("privacy", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("AppInstallationPrivacy")).build());
      this.fieldsSet.add("privacy");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
