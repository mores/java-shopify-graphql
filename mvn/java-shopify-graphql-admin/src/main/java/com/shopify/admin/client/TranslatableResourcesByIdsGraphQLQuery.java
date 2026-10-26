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
 * Returns a paginated list of [`TranslatableResource`](https://shopify.dev/docs/api/admin-graphql/latest/objects/TranslatableResource)
 * objects for the specified resource IDs. Each resource provides translatable
 * content and digest values needed for the [`translationsRegister`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/translationsRegister) mutation.
 *   
 * Learn more about [managing translated content](https://shopify.dev/docs/apps/build/markets/manage-translated-content).
 */
public class TranslatableResourcesByIdsGraphQLQuery extends GraphQLQuery {
  public TranslatableResourcesByIdsGraphQLQuery(List<String> resourceIds, Integer first,
      String after, Integer last, String before, Boolean reverse, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (resourceIds != null || fieldsSet.contains("resourceIds")) {
        getInput().put("resourceIds", resourceIds);
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
    }
  }

  public TranslatableResourcesByIdsGraphQLQuery(List<String> resourceIds, Integer first,
      String after, Integer last, String before, Boolean reverse, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (resourceIds != null || fieldsSet.contains("resourceIds")) {
        getInput().put("resourceIds", resourceIds);
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
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public TranslatableResourcesByIdsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "translatableResourcesByIds";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<String> resourceIds;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private String queryName;

    public TranslatableResourcesByIdsGraphQLQuery build() {
      return new TranslatableResourcesByIdsGraphQLQuery(resourceIds, first, after, last, before, reverse, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Return only resources for given IDs.
     */
    public Builder resourceIds(List<String> resourceIds) {
      this.resourceIds = resourceIds;
      this.fieldsSet.add("resourceIds");
      return this;
    }

    /**
     * Return only resources for given IDs.
     */
    public Builder resourceIdsReference(String variableRef) {
      this.variableReferences.put("resourceIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("resourceIds");
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

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
