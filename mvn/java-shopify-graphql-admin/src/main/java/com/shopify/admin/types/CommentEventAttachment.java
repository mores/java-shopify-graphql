package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A file attachment associated to a comment event.
 */
public class CommentEventAttachment {
  /**
   * The file extension of the comment event attachment, indicating the file format.
   */
  private String fileExtension;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The image attached to the comment event.
   */
  private Image image;

  /**
   * The filename of the comment event attachment.
   */
  private String name;

  /**
   * The size of the attachment.
   */
  private int size;

  /**
   * The URL of the attachment.
   */
  private String url;

  public CommentEventAttachment() {
  }

  /**
   * The file extension of the comment event attachment, indicating the file format.
   */
  public String getFileExtension() {
    return fileExtension;
  }

  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The image attached to the comment event.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * The filename of the comment event attachment.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The size of the attachment.
   */
  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  /**
   * The URL of the attachment.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "CommentEventAttachment{fileExtension='" + fileExtension + "', id='" + id + "', image='" + image + "', name='" + name + "', size='" + size + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CommentEventAttachment that = (CommentEventAttachment) o;
    return Objects.equals(fileExtension, that.fileExtension) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(name, that.name) &&
        size == that.size &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileExtension, id, image, name, size, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The file extension of the comment event attachment, indicating the file format.
     */
    private String fileExtension;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The image attached to the comment event.
     */
    private Image image;

    /**
     * The filename of the comment event attachment.
     */
    private String name;

    /**
     * The size of the attachment.
     */
    private int size;

    /**
     * The URL of the attachment.
     */
    private String url;

    public CommentEventAttachment build() {
      CommentEventAttachment result = new CommentEventAttachment();
      result.fileExtension = this.fileExtension;
      result.id = this.id;
      result.image = this.image;
      result.name = this.name;
      result.size = this.size;
      result.url = this.url;
      return result;
    }

    /**
     * The file extension of the comment event attachment, indicating the file format.
     */
    public Builder fileExtension(String fileExtension) {
      this.fileExtension = fileExtension;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The image attached to the comment event.
     */
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    /**
     * The filename of the comment event attachment.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The size of the attachment.
     */
    public Builder size(int size) {
      this.size = size;
      return this;
    }

    /**
     * The URL of the attachment.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
