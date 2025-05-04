package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ArticleFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ArticleFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Article"));
  }

  public ArticleFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleAuthorProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> author() {
     ArticleAuthorProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> projection = new ArticleAuthorProjection<>(this, getRoot());
     getFields().put("author", projection);
     return projection;
  }

  public ArticleAuthorProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> authorV2() {
     ArticleAuthorProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> projection = new ArticleAuthorProjection<>(this, getRoot());
     getFields().put("authorV2", projection);
     return projection;
  }

  public BlogProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> blog() {
     BlogProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> projection = new BlogProjection<>(this, getRoot());
     getFields().put("blog", projection);
     return projection;
  }

  public CommentConnectionProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> comments() {
     CommentConnectionProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> projection = new CommentConnectionProjection<>(this, getRoot());
     getFields().put("comments", projection);
     return projection;
  }

  public CommentConnectionProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> comments(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CommentConnectionProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> projection = new CommentConnectionProjection<>(this, getRoot());    
    getFields().put("comments", projection);
    getInputArguments().computeIfAbsent("comments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("comments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("comments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("comments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("comments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("comments").add(reverseArg);
    return projection;
  }

  public ImageProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MetafieldProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public SEOProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> seo() {
     SEOProjection<ArticleFragmentProjection<PARENT, ROOT>, ROOT> projection = new SEOProjection<>(this, getRoot());
     getFields().put("seo", projection);
     return projection;
  }

  public ArticleFragmentProjection<PARENT, ROOT> content() {
    getFields().put("content", null);
    return this;
  }

  public ArticleFragmentProjection content(Integer truncateAt) {
    getFields().put("content", null);
    getInputArguments().computeIfAbsent("content", k -> new ArrayList<>());
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt);
    getInputArguments().get("content").add(truncateAtArg);
    return this;
  }

  public ArticleFragmentProjection<PARENT, ROOT> contentHtml() {
    getFields().put("contentHtml", null);
    return this;
  }

  public ArticleFragmentProjection<PARENT, ROOT> excerpt() {
    getFields().put("excerpt", null);
    return this;
  }

  public ArticleFragmentProjection excerpt(Integer truncateAt) {
    getFields().put("excerpt", null);
    getInputArguments().computeIfAbsent("excerpt", k -> new ArrayList<>());
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt);
    getInputArguments().get("excerpt").add(truncateAtArg);
    return this;
  }

  public ArticleFragmentProjection<PARENT, ROOT> excerptHtml() {
    getFields().put("excerptHtml", null);
    return this;
  }

  public ArticleFragmentProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ArticleFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ArticleFragmentProjection<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public ArticleFragmentProjection<PARENT, ROOT> publishedAt() {
    getFields().put("publishedAt", null);
    return this;
  }

  public ArticleFragmentProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public ArticleFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ArticleFragmentProjection<PARENT, ROOT> trackingParameters() {
    getFields().put("trackingParameters", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Article {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
