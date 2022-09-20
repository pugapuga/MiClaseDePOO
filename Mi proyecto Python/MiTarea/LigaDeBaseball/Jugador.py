#!/usr/bin/python
# -*- coding: UTF-8 -*-
from MiTarea.LigaDeBaseball import Equipo
from typing import List

class Jugador(object):
	def Jugador(self):
		pass

	def getNombre(self):
		return self.___nombre

	def setNombre(self, aNombre) -> None:
		self.___nombre = aNombre

	def __init__(self):
		self.___nombre = None
		self._elEquipo : Equipo = None
		"""# @AssociationMultiplicity 1"""

