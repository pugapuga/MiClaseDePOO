#!/usr/bin/python
# -*- coding: UTF-8 -*-
from MiTarea.LigaDeBaseball import Liga
from typing import List

class Equipo(object):
	def Equipo(self):
		pass

	def getNombre(self):
		return self.___nombre

	def setNombre(self, aNombre) -> None:
		self.___nombre = aNombre

	def __init__(self):
		self.___nombre = None
		self._laLiga : Liga = None
		"""# @AssociationMultiplicity 1"""
		self._losJugadores = []
		"""# @AssociationMultiplicity *
		# @AssociationKind Composition"""

