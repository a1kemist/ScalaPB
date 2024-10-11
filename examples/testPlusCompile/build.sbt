scalaVersion := "2.13.8"

Compile / PB.targets := Seq(
  scalapb.gen() -> (Compile / sourceManaged).value / "scalapb"
)

Test / PB.targets := Seq(
  scalapb.gen() -> (Test / sourceManaged).value / "scalapb"
)
