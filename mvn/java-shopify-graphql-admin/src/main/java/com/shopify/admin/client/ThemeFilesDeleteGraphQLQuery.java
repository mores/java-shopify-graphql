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
 * Deletes a theme's files.
 */
public class ThemeFilesDeleteGraphQLQuery extends GraphQLQuery {
  public ThemeFilesDeleteGraphQLQuery(String themeId, List<String> files, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (themeId != null || fieldsSet.contains("themeId")) {
        getInput().put("themeId", themeId);
    }if (files != null || fieldsSet.contains("files")) {
        getInput().put("files", files);
    }
  }

  public ThemeFilesDeleteGraphQLQuery(String themeId, List<String> files, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (themeId != null || fieldsSet.contains("themeId")) {
        getInput().put("themeId", themeId);
    }if (files != null || fieldsSet.contains("files")) {
        getInput().put("files", files);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ThemeFilesDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "themeFilesDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String themeId;

    private List<String> files;

    private String queryName;

    public ThemeFilesDeleteGraphQLQuery build() {
      return new ThemeFilesDeleteGraphQLQuery(themeId, files, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Specifies the theme to deleted.
     */
    public Builder themeId(String themeId) {
      this.themeId = themeId;
      this.fieldsSet.add("themeId");
      return this;
    }

    /**
     * Specifies the theme to deleted.
     */
    public Builder themeIdReference(String variableRef) {
      this.variableReferences.put("themeId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("themeId");
      return this;
    }

    /**
     * The files to delete.
     */
    public Builder files(List<String> files) {
      this.files = files;
      this.fieldsSet.add("files");
      return this;
    }

    /**
     * The files to delete.
     */
    public Builder filesReference(String variableRef) {
      this.variableReferences.put("files", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("String"))))).build());
      this.fieldsSet.add("files");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
