package projekt.packagea

import projekt.packageb.packageb

class packagea(using pb: packageb):
	def hello(): Unit =
		println(s"hello world from package a! ${pb}")