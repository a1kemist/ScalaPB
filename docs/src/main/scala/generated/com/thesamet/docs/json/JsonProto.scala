// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!

package com.thesamet.docs.json

object JsonProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.any.AnyProto
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      com.thesamet.docs.json.MyMessage,
      com.thesamet.docs.json.MyContainer
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """Cgpqc29uLnByb3RvEhFjb20udGhlc2FtZXQuZG9jcxoZZ29vZ2xlL3Byb3RvYnVmL2FueS5wcm90byIhCglNeU1lc3NhZ2USF
  AoBeBgBIAEoBUIG4j8DEgF4UgF4IkYKC015Q29udGFpbmVyEjcKBm15X2FueRgBIAEoCzIULmdvb2dsZS5wcm90b2J1Zi5BbnlCC
  uI/BxIFbXlBbnlSBW15QW55YgZwcm90bzM="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
      com.google.protobuf.any.AnyProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}