package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Image implements com.shopify.types.HasMetafields {
  
  private String altText;

  
  private Integer height;

  
  private String id;

  
  private Metafield metafield;

  
  private MetafieldConnection metafields;

  
  private String originalSrc;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  
  private String src;

  
  private String transformedSrc;

  
  private String url;

  
  private Integer width;

  public Image() {
  }

  
  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  
  public String getOriginalSrc() {
    return originalSrc;
  }

  public void setOriginalSrc(String originalSrc) {
    this.originalSrc = originalSrc;
  }

  
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  
  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  
  public String getTransformedSrc() {
    return transformedSrc;
  }

  public void setTransformedSrc(String transformedSrc) {
    this.transformedSrc = transformedSrc;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  @Override
  public String toString() {
    return "Image{altText='" + altText + "', height='" + height + "', id='" + id + "', metafield='" + metafield + "', metafields='" + metafields + "', originalSrc='" + originalSrc + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', src='" + src + "', transformedSrc='" + transformedSrc + "', url='" + url + "', width='" + width + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Image that = (Image) o;
    return Objects.equals(altText, that.altText) &&
        Objects.equals(height, that.height) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(originalSrc, that.originalSrc) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(src, that.src) &&
        Objects.equals(transformedSrc, that.transformedSrc) &&
        Objects.equals(url, that.url) &&
        Objects.equals(width, that.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altText, height, id, metafield, metafields, originalSrc, privateMetafield, privateMetafields, src, transformedSrc, url, width);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String altText;

    
    private Integer height;

    
    private String id;

    
    private Metafield metafield;

    
    private MetafieldConnection metafields;

    
    private String originalSrc;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    
    private String src;

    
    private String transformedSrc;

    
    private String url;

    
    private Integer width;

    public Image build() {
      Image result = new Image();
      result.altText = this.altText;
      result.height = this.height;
      result.id = this.id;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.originalSrc = this.originalSrc;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.src = this.src;
      result.transformedSrc = this.transformedSrc;
      result.url = this.url;
      result.width = this.width;
      return result;
    }

    
    public Builder altText(String altText) {
      this.altText = altText;
      return this;
    }

    
    public Builder height(Integer height) {
      this.height = height;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder originalSrc(String originalSrc) {
      this.originalSrc = originalSrc;
      return this;
    }

    
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    
    public Builder src(String src) {
      this.src = src;
      return this;
    }

    
    public Builder transformedSrc(String transformedSrc) {
      this.transformedSrc = transformedSrc;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    
    public Builder width(Integer width) {
      this.width = width;
      return this;
    }
  }
}
