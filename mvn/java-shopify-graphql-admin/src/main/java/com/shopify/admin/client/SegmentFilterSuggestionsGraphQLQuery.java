package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * A list of filter suggestions associated with a segment. A segment is a group
 * of members (commonly customers) that meet specific criteria.
 */
public class SegmentFilterSuggestionsGraphQLQuery extends GraphQLQuery {
  public SegmentFilterSuggestionsGraphQLQuery(String search, int first, String after,
      String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }getInput().put("first", first);                   if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }
  }

  public SegmentFilterSuggestionsGraphQLQuery(String search, int first, String after,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }getInput().put("first", first);                   if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SegmentFilterSuggestionsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "segmentFilterSuggestions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String search;

    private int first;

    private String after;

    private String queryName;

    public SegmentFilterSuggestionsGraphQLQuery build() {
      return new SegmentFilterSuggestionsGraphQLQuery(search, first, after, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Returns the elements of a list by keyword or term.
     */
    public Builder search(String search) {
      this.search = search;
      this.fieldsSet.add("search");
      return this;
    }

    /**
     * Returns the elements of a list by keyword or term.
     */
    public Builder searchReference(String variableRef) {
      this.variableReferences.put("search", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("search");
      return this;
    }

    /**
     * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder first(int first) {
      this.first = first;
      this.fieldsSet.add("first");
      return this;
    }

    /**
     * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder firstReference(String variableRef) {
      this.variableReferences.put("first", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("Int"))).build());
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

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
