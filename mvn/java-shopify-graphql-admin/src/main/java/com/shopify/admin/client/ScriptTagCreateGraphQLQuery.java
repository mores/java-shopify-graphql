package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ScriptTagInput;
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
 * <div class="note">&lt;h4>Theme app extensions&lt;/h4>
 *   <p>If your app integrates with a Shopify theme and you plan to submit it to
 * the Shopify App Store, you must use theme app extensions instead of Script
 * tags. Script tags can only be used with vintage themes. <a
 * href="/apps/online-store#what-integration-method-should-i-use"
 * target="_blank">Learn more</a>.</p></div>
 *   
 *   
 * Creates a new script tag.
 */
public class ScriptTagCreateGraphQLQuery extends GraphQLQuery {
  public ScriptTagCreateGraphQLQuery(ScriptTagInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ScriptTagCreateGraphQLQuery(ScriptTagInput input, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ScriptTagCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "scriptTagCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private ScriptTagInput input;

    private String queryName;

    public ScriptTagCreateGraphQLQuery build() {
      return new ScriptTagCreateGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input fields for a script tag.
     */
    public Builder input(ScriptTagInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input fields for a script tag.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ScriptTagInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
