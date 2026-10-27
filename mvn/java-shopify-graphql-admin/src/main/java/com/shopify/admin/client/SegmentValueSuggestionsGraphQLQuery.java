package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import graphql.language.VariableDefinition;
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
 * The list of suggested values corresponding to a particular filter for a
 * segment. A segment is a group of members, such as customers, that meet
 * specific criteria.
 */
public class SegmentValueSuggestionsGraphQLQuery extends GraphQLQuery {
  public SegmentValueSuggestionsGraphQLQuery(String search, String filterQueryName,
      String functionParameterQueryName, Integer first, String after, Integer last, String before,
      String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }if (filterQueryName != null || fieldsSet.contains("filterQueryName")) {
        getInput().put("filterQueryName", filterQueryName);
    }if (functionParameterQueryName != null || fieldsSet.contains("functionParameterQueryName")) {
        getInput().put("functionParameterQueryName", functionParameterQueryName);
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

  public SegmentValueSuggestionsGraphQLQuery(String search, String filterQueryName,
      String functionParameterQueryName, Integer first, String after, Integer last, String before,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }if (filterQueryName != null || fieldsSet.contains("filterQueryName")) {
        getInput().put("filterQueryName", filterQueryName);
    }if (functionParameterQueryName != null || fieldsSet.contains("functionParameterQueryName")) {
        getInput().put("functionParameterQueryName", functionParameterQueryName);
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

  public SegmentValueSuggestionsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "segmentValueSuggestions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String search;

    private String filterQueryName;

    private String functionParameterQueryName;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private String queryName;

    public SegmentValueSuggestionsGraphQLQuery build() {
      return new SegmentValueSuggestionsGraphQLQuery(search, filterQueryName, functionParameterQueryName, first, after, last, before, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * Returns the elements of a list by filter handle.
     */
    public Builder filterQueryName(String filterQueryName) {
      this.filterQueryName = filterQueryName;
      this.fieldsSet.add("filterQueryName");
      return this;
    }

    /**
     * Returns the elements of a list by filter handle.
     */
    public Builder filterQueryNameReference(String variableRef) {
      this.variableReferences.put("filterQueryName", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("filterQueryName");
      return this;
    }

    /**
     * Returns the elements of a list by filter parameter name.
     */
    public Builder functionParameterQueryName(String functionParameterQueryName) {
      this.functionParameterQueryName = functionParameterQueryName;
      this.fieldsSet.add("functionParameterQueryName");
      return this;
    }

    /**
     * Returns the elements of a list by filter parameter name.
     */
    public Builder functionParameterQueryNameReference(String variableRef) {
      this.variableReferences.put("functionParameterQueryName", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("functionParameterQueryName");
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
