package projekt.packagea

import projekt.packageb.packageb
import projekt.packageb.packageb_otherthing

class packagea(using pb: packageb, pbot: packageb_otherthing):
	def hello(): Unit =
		println(s"hello world from package a! ${pb} ${pbot}")