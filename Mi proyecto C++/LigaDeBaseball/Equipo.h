#ifndef EQUIPO_H
#define EQUIPO_H

namespace MiTarea {
	namespace LigaDeBaseball {
		class Equipo {

		private:
			int nombre;
			MiTarea::LigaDeBaseball::Liga laLiga;
			std::vector<MiTarea::LigaDeBaseball::Jugador> losJugadores;

		public:
			Equipo();

			void getNombre();

			void setNombre(int nombre);
		};
	}
}

#endif
