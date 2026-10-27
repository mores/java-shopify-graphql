package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ThemeRole;
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
 * Creates a theme from an external URL or staged upload. The theme source can
 * either be a ZIP file hosted at a public URL or files previously uploaded using the [`stagedUploadsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/stageduploadscreate)
 * mutation. The theme displays in the [Themes
 * page](https://admin.shopify.com/themes) in the Shopify admin.
 *   
 * New themes have an [`UNPUBLISHED`](https://shopify.dev//docs/api/admin-graphql/latest/mutations/themeCreate#arguments-role.enums.UNPUBLISHED)
 * role by default. You can optionally specify a [`DEVELOPMENT`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/themeCreate#arguments-role.enums.DEVELOPMENT)
 * role for temporary themes used during development.
 */
public class ThemeCreateGraphQLQuery extends GraphQLQuery {
  public ThemeCreateGraphQLQuery(String source, String name, ThemeRole role, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (source != null || fieldsSet.contains("source")) {
        getInput().put("source", source);
    }if (name != null || fieldsSet.contains("name")) {
        getInput().put("name", name);
    }if (role != null || fieldsSet.contains("role")) {
        getInput().put("role", role);
    }
  }

  public ThemeCreateGraphQLQuery(String source, String name, ThemeRole role, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (source != null || fieldsSet.contains("source")) {
        getInput().put("source", source);
    }if (name != null || fieldsSet.contains("name")) {
        getInput().put("name", name);
    }if (role != null || fieldsSet.contains("role")) {
        getInput().put("role", role);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ThemeCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "themeCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String source;

    private String name;

    private ThemeRole role;

    private String queryName;

    public ThemeCreateGraphQLQuery build() {
      return new ThemeCreateGraphQLQuery(source, name, role, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * An external URL or a
     * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate)
     * of the theme to import.
     */
    public Builder source(String source) {
      this.source = source;
      this.fieldsSet.add("source");
      return this;
    }

    /**
     * An external URL or a
     * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate)
     * of the theme to import.
     */
    public Builder sourceReference(String variableRef) {
      this.variableReferences.put("source", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("URL"))).build());
      this.fieldsSet.add("source");
      return this;
    }

    /**
     * The name of the theme to be created.
     */
    public Builder name(String name) {
      this.name = name;
      this.fieldsSet.add("name");
      return this;
    }

    /**
     * The name of the theme to be created.
     */
    public Builder nameReference(String variableRef) {
      this.variableReferences.put("name", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("name");
      return this;
    }

    /**
     * The role of the theme to be created. Only UNPUBLISHED and DEVELOPMENT roles are permitted.
     */
    public Builder role(ThemeRole role) {
      this.role = role;
      this.fieldsSet.add("role");
      return this;
    }

    /**
     * The role of the theme to be created. Only UNPUBLISHED and DEVELOPMENT roles are permitted.
     */
    public Builder roleReference(String variableRef) {
      this.variableReferences.put("role", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ThemeRole")).build());
      this.fieldsSet.add("role");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
