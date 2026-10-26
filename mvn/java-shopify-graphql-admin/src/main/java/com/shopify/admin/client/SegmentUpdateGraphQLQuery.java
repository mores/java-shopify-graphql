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
 * Updates a segment.
 */
public class SegmentUpdateGraphQLQuery extends GraphQLQuery {
  public SegmentUpdateGraphQLQuery(String id, String name, String query, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (name != null || fieldsSet.contains("name")) {
        getInput().put("name", name);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }
  }

  public SegmentUpdateGraphQLQuery(String id, String name, String query, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (name != null || fieldsSet.contains("name")) {
        getInput().put("name", name);
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

  public SegmentUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "segmentUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private String name;

    private String query;

    private String queryName;

    public SegmentUpdateGraphQLQuery build() {
      return new SegmentUpdateGraphQLQuery(id, name, query, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Specifies the segment to be updated.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * Specifies the segment to be updated.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The new name for the segment.
     */
    public Builder name(String name) {
      this.name = name;
      this.fieldsSet.add("name");
      return this;
    }

    /**
     * The new name for the segment.
     */
    public Builder nameReference(String variableRef) {
      this.variableReferences.put("name", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("name");
      return this;
    }

    /**
     * A precise definition of the segment. The definition is composed of a
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
     * A precise definition of the segment. The definition is composed of a
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

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
