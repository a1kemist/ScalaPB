// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package scalapb.docs.person

object PersonProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq.empty
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      scalapb.docs.person.Person
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """CgxwZXJzb24ucHJvdG8SDHNjYWxhcGIuZG9jcyLvAgoGUGVyc29uEh0KBG5hbWUYASABKAlCCeI/BhIEbmFtZVIEbmFtZRIaC
  gNhZ2UYAiABKAVCCOI/BRIDYWdlUgNhZ2USSgoJYWRkcmVzc2VzGAMgAygLMhwuc2NhbGFwYi5kb2NzLlBlcnNvbi5BZGRyZXNzQ
  g7iPwsSCWFkZHJlc3Nlc1IJYWRkcmVzc2VzGqQBCgdBZGRyZXNzElUKDGFkZHJlc3NfdHlwZRgBIAEoDjIgLnNjYWxhcGIuZG9jc
  y5QZXJzb24uQWRkcmVzc1R5cGVCEOI/DRILYWRkcmVzc1R5cGVSC2FkZHJlc3NUeXBlEiMKBnN0cmVldBgCIAEoCUIL4j8IEgZzd
  HJlZXRSBnN0cmVldBIdCgRjaXR5GAMgASgJQgniPwYSBGNpdHlSBGNpdHkiNwoLQWRkcmVzc1R5cGUSEwoESE9NRRAAGgniPwYSB
  EhPTUUSEwoEV09SSxABGgniPwYSBFdPUktiBnByb3RvMw=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}