scalaVersion := "2.13.8"

Test / PB.targets := Seq(
  scalapb.gen() -> (Test / sourceManaged).value / "scalapb"
)
